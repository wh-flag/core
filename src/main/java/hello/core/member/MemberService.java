package hello.core.member;

public interface MemberService {


    // 두가지 기능 1. 회원가입, 2. 회원조회

    void join(Member member);

    Member findMember(Long memberId);

}
