package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectdValue = 1;                  // 상속 관계라 접근 가능
        // defaultValue = 1;                // 다른 패키지라 접근이 안됨
        // protectedValue = 1;              // 같은 클래스가 아니라 접근 불가

        publicMethod();
        protectedMethod();
        // defaultMethod();
        // protectedMethod();

        printParent();
    }
}
