package hello.core.member;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    // 사용할 객체 선택 -> MemoryMemberRepository

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    } // 생성자에 autowired -> 의존 관계 자동 주입

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    //TEST 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }

}
