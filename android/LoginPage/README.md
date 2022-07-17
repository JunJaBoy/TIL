# LoginPage

## 20220617

- 로그인 화면 구현



## 20220618

### 업데이트

- Sign Up 버튼 일부 구현
  - Sign Up 버튼 클릭 시 Sign Up 페이지로 넘어간다
    - 아이디와 비밀번호, 비밀번호 확인 칸을 입력할 수 있다

- 휴대전화의 다크모드 적용 상태에서도 무조건 라이트 모드 테마로 실행되도록 구현

### 구현할 기능

- Sign Up 화면의 정보 추가
  - 사용자 닉네임
  - 이메일

- 로그인 및 회원가입 창의 LinearLayout을 구성하는 더 큰 부모격 LinearLayout 구현
- Portrait 화면의 View 구성은 전체적으로 깔끔한 반면, Landscape 화면의 View들의 구성이 일정하지 못하다

### 장점

- 디자인이 전체적으로 깔끔..하다 ㅎ

### 단점

- 기능 구현이 미흡하다

## 20220619

### 업데이트

- 기존의 뷰들을 포함하고 있는 레이아웃은 화면 전체를 덮고 있지 않았지만, 오늘 수정을 통하여 새로운 화면 전체를 덮는 레이아웃(LinearLayout)을 추가하여 기존의 레이아웃을 포함하도록 하였다

- - 

### 구현할 기능

- 로그인, 회원가입 시 한 화면에서 모든 정보(ID, 비밀번호)를 입력하지 않고, 프래그먼트로 한 화면당 한 정보씩 입력(예 : 화면1 : ID --> 화면2 : 비밀번호)

로그인 화면에서 ID 정보를 입력하고 Sign Up 버튼을 눌러 회원가입으로 이동 시 기존의 입력되었던 정보를 Intent를 통해 회원가입에서 추가적인 입력을 할 필요 없이 자동으로 입력되도록 하였다

- 입력된 정보가 없으면 전달하지 않는다

### 개선

- XML document structures must start and end within the same entity. 라는 오류가 발생하였다

  - activity_main의 LinearLayout 뷰 문장을 제대로 닫지 않아서 발생하였다.

    ``` xml
    <LinearLayout
    				<LinearLayout
    				(CONTENTS)
    				(CONTENTS)>
    여기--->>		  </LinearLayout>
    </LinearLayout>
    ```
