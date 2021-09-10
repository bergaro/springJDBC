# JDBC API, JdbcTemplate, NamedParametersJdbcTemplate

### 2. Миграции

- Приложение стартует на порту 24001

- В свойствах приложения - _spring.sql.init.mode=never_

- Обрабатывается 1 видз GET запроса: (http://localhost:24001/products/fetch-product?name=sthParam) 