fun ConnpassService.searchKeywordExt(
        keyword: String,
        ymd: String? = null,
        order: Order? = null
) = searchKeyword(keyword, ymd, order?.index)

enum class Order(val index: Int) {
    UPDATE(1);
    override fun toString() = "$index"
}

// 
service.searchKeywordExt("kotlin")
//
searchKeywordExt("hoge", order = Order.UPDATE)
