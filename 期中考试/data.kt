data class News(
    val id: Int,
    val name:String,
    val title:String,
    val number:Int,
    val content:String
)
data class Novel(
    val id: Int,
    val name:String,
    val classification: String,
    val writer:String,
    val number:Int
)

object UserData{
    val NewsList = mutableListOf(
        News(1,"新闻一","今天吃什么",1000000,"吃饭"),
        News(2,"新闻二","明天去哪玩",1000000,"出去玩"),
        News(3,"新闻三","什么时候放假",1000000,"回家睡觉"),
    )
    val NovelList = mutableListOf(
        Novel(1,"隐形的朋友","生活随笔","无名氏",1000000),
        Novel(2,"三千梦天","短篇小说","小羊",1000000),
        Novel(3,"他的眼里有星光","言情小说","Word",1000000),
    )
}