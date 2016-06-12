Brief explanation:
	MainActivity.java:
		Calculator的部分與lab10的做法是一樣的，但是結合一開始的畫面是讓user輸入IP，輸入之後才會跳到calculator的page，而calculator的result會連線到server並將其轉成bytes的方式送到server。
		
	Server.java:
		新增frame來顯示從client端接收到的資訊並用label print出來。

The problem:
	1.要傳送到server的資料要轉為bytes檔，一開始比較不了解。
    ->研究助教給的code和上網查。
    2.一開始要import進去到AndroidStudio裡面介面不熟悉，甚至常會出差錯。
    ->多摸索。