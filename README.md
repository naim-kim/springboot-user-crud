# 🌍 Spring Boot User CRUD API

> 🇬🇧 English | [🇰🇷 한국어 : 자 우리 서버5기 파디들은 여기 누르세요 🫡](#-스프링-부트-유저-crud-api)

---

A simple and clean RESTful CRUD application for managing users, built with Spring Boot.  
Perfect for beginners learning Spring MVC, JPA, and API documentation with Swagger.

### 🚀 Features
- Create, Read, Update, Delete Users
- Filter users by `part`
- Swagger UI for testing endpoints
- Lightweight and beginner-friendly structure

### 🛠️ Tech Stack
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 / MySQL
- Swagger (springdoc-openapi)
- Lombok

### 📦 Project Structure
```
src/
└── user/
├── controller/
├── service/
├── repo/
├── entity/
└── dto/
```

### 🧪 API Endpoints

| Method | Endpoint         | Description                      |
|--------|------------------|----------------------------------|
| `GET`  | `/user?part=all` | Get all users or filter by part |
| `POST` | `/user`          | Create a new user               |
| `PATCH`| `/user/{id}`     | Update an existing user         |
| `DELETE`| `/user/{id}`    | Delete user by ID               |

```json
// Sample Request Body
{
  "name": "Naim",
  "age": 24,
  "part": "Server"
}
```

### 🧾 Run Locally

```bash
git clone https://github.com/naim-kim/springboot-user-crud.git
cd springboot-user-crud
./mvnw spring-boot:run
```

### 🔍 Swagger UI

Visit: `http://localhost:8080/swagger-ui/index.html`

### 🙌 Author
Made by [Naim Kim](https://github.com/naim-kim) (PARD 5기) ☕

---
## 🇰🇷 스프링 부트 유저 CRUD API

> [Back to English](#-spring-boot-user-crud-api)

스프링 부트를 활용한 간단한 유저 CRUD 프로젝트입니다.  
처음 REST API, JPA, Swagger를 배우는 분들에게 적합한 구조로 구성되어 있습니다.

### 🚀 주요 기능
- 유저 생성, 조회, 수정, 삭제
- `part` 기준 필터링 기능
- Swagger UI로 API 테스트 가능
- 최소한의 구성으로 빠르게 이해 가능

### 🛠️ 기술 스택
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 / MySQL
- Swagger (springdoc-openapi)
- Lombok

### 📦 프로젝트 구조
```
src/
└── user/
    ├── controller/
    ├── service/
    ├── repo/
    ├── entity/
    └── dto/
```

### 🧪 API 목록

| 메서드 | 엔드포인트        | 설명                         |
|--------|-------------------|------------------------------|
| `GET`  | `/user?part=all`  | 모든 유저 조회 또는 필터링     |
| `POST` | `/user`           | 유저 생성                    |
| `PATCH`| `/user/{id}`      | 유저 정보 수정               |
| `DELETE`| `/user/{id}`     | 유저 삭제                    |

```json
// 예시 요청 JSON
{
  "name": "Naim",
  "age": 24,
  "part": "Server"
}
```

### 🧾 실행 방법

```bash
git clone https://github.com/naim-kim/springboot-user-crud.git
cd springboot-user-crud
./mvnw spring-boot:run ## 아니면 IntelliJ  으로 run  하면 끝!
```

### 🔍 Swagger 사용

`http://localhost:8080/swagger-ui/index.html` 접속해서 잘 돌아가는지 확인하기!

### 🙌 만든 사람
PARD 5기 [Naim Kim](https://github.com/naim-kim)

---