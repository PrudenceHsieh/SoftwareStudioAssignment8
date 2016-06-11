Brief explanation:
	MainActivity.java:
		Calculator的部分與lab10的做法是一樣的，但是結合一開始的畫面是讓user輸入IP，輸入之後才會跳到calculator的page，而calculator的result會連線到server並將其轉成bytes的方式送到server。
		
	Server.java:
		在main裡declare thread，並start。並建立同一個port的server socket，然後declare一個socket來accept這個server socket，並將接收到的資料print出來。

The problem:
	1.server與client之間的連線還不是很熟，所以很容易失敗。
	->Solution:邊查資料。