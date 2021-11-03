package hello.core.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    // 사용할 객체 선택 -> MemoryMemberRepository


    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
