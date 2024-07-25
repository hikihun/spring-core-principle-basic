package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
    excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
//ComponentScan을 했을 때 AppConfig도 스캔되기 때문에 임시로 @Configuration 어노테이션이 있는 컴포넌트를 제외함
public class AutoAppConfig {

    //수동 빈 등록과 자동 빈 등록의 충돌로 스프링부트 테스트시에 에러가 발생해서 주석처리 함
//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}
