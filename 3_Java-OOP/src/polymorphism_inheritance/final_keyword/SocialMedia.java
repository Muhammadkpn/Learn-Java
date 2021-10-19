package polymorphism_inheritance.final_keyword;

class SocialMedia {
    String name;
}

class Facebook extends SocialMedia {
    final void login(String username, String password) {

    }
}

class FakeFacebook extends Facebook {
    // void login(String username, String password) { exception.error -> final method tdk bisa dioverride
    // }
}

/**
 *
    final class Facebook extends SocialMedia {

    }

    class FakeFacebook extends Facebook { exception.error -> tidak bisa diturunkan krn final class tidak bisa berubah
    }
 *
 */
