public interface ConnpassService {

    void searchKeyword(@NonNull String keyword,
                       @Nullable String ym,
                       @Nullable Integer order);
}

//
service.searchKeyword("kotlin", null, null);
//
service.searchKeyword("kotlin", "201602", 1);
