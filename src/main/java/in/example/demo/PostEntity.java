package in.example.demo;
// エンティティとは、データベースと連携する際にデータを格納するためのオブジェクト
public class PostEntity {
	// 変数として、idおよびmemoを宣言
	private long id;
	private String memo;

	public PostEntity(long id, String memo) {
		// 変数を初期化するコンストラクタ
		this.id = id;
		this.memo = memo;
	}

	// 変数のゲッター・セッター
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
