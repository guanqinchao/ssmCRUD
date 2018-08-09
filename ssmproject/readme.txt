resultType 和restltMap
restulyType:
1.对应的是java对象中的属性，大小写不敏感，
2.如果放的是java.lang.Map,key是查询语句的列名，value是查询的值，大小写敏感
3.resultMap:指的是定义好了的id的，是定义好的resyltType的引用
注意：用resultType的时候，要保证结果集的列名与java对象的属性相同，而resultMap则不用，而且resultMap可以用typeHander转换
4.type:java 对象对应的类，id:在本文件要唯一column :数据库的列名或别名，property:对应java对象的属性，jdbcType:java.sql.Types
查询语句中，resultMap属性指向上面那个属性的标签的id
parameterType:参数类型，只能传一个参数，如果有多个参数要封装，如封装成一个类，要写包名加类名，基本数据类型则可以省略
5.一对1、一对多时，若有表的字段相同必须写别名，不然查询结果无法正常映射，出现某属性为空或者返回的结果与想象中的不同，而这往往是没有报错的。
6.若有意外中的错误，反复检查以上几点，和认真核查自己的sql语句，mapper.xml文件是否配置正确。


另外还有resultMap 元素，它是 MyBatis 中最重要最强大的元素，它能提供级联查询，缓存等功能。