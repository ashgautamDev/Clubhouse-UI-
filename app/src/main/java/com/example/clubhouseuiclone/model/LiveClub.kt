package com.example.clubhouseuiclone.model

data class LiveClub(
    val clubId: Int,
    val clubName: String,
    val clubTitle: String,
    val modCount: Int,
    val audCount: Int
)


val liveClubList = listOf(
    LiveClub(0, "All india startups", "Crypto Q&A Wrong answer only ! ", 4, 250),
    LiveClub(1,"All india startups" , "Resume Tips from FAANG Recruiters ans Hiring Managers" , 3,150),
    LiveClub(2,"Jobs & Career guidance" , "I keep applying for jobs. Why no interview calls ?",5,321),
    LiveClub(3,"all about self - growth", "Qhat are some habits that help you live a happier life?",2, 47),
    LiveClub(4,"Legalsollers mentored ", "Linkedln Tips & Networking- Part 3",2,67),
    LiveClub(5,"Monkey talks", " Life problems at 25 vs 30 Learn from Expereince",1,654),
    LiveClub(6,"the pitch room", "How To Pitch To VCs & Angel Investors",5,90)
)