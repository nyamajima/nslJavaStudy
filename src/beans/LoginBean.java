package beans;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class LoginBean {

    /**
     * 名前
     */
    private String name;

    /**
     * パスワード
     */
    private String password;

    /**
     * メッセージ
     */
    private String msg;

    /** Setter & Getter  */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@PostConstruct
	public void init() {
		System.out.println("初期処理");
	}

	/**
	 * ログイン処理
	 *
	 * @return 遷移先XHTMLのパス
	 */
	public String login() {
		this.msg = "Hello " + this.name;
		return "/WEB-INF/xhtml/output.xhtml";
	}

}
