package in.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
// エンティティとは、データベースと連携する際にデータを格納するためのオブジェクト
public class PostEntity {
	// 変数として、idおよびmemoを宣言
	private long id;
	private String memo;
}
