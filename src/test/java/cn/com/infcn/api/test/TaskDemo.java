package cn.com.infcn.api.test;

import org.nlpcn.jcoder.filter.TokenFilter;
import org.nlpcn.jcoder.run.annotation.Execute;
import org.nlpcn.jcoder.run.annotation.Single;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.mvc.annotation.By;
import org.nutz.mvc.annotation.Filters;
import org.slf4j.Logger;

@Single(true)
public class TaskDemo {

	int i = 0;
	@Inject
	private Logger log;

	/**
	 * 测试
	 *
	 * @return {"FBI":[{"name":"rose","age":"25"},{"name":"jack","age":"23"}],"NBA":[{"name":"tom","sex":"man"},{"name":"jack","sex":"women"}],"NBA":[{"name":"tom","sex":"man"},{"name":"jack","sex":"women"}],"NBA":[{"name":"tom","sex":"man"},{"name":"jack","sex":"women"}],"NBA":[{"name":"tom","sex":"man"},{"name":"jack","sex":"women"}],"NBA":[{"name":"tom","sex":"man"},{"name":"jack","sex":"women"}],"NBA":[{"name":"tom","sex":"man"},{"name":"jack","sex":"women"}]}
	 */
	@Execute
	@Filters(@By(type = TokenFilter.class, args = {"false"}))
	public Object execute(String name, Integer age, Character sex) {
		log.info("12312312");
		return "name:" + name + " age:" + age + " sex:" + sex;
	}

}
