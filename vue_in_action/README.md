#### 1. MVVM Pattern



View-Model 에서 데이터가 변하면 데이터에 연결된 View는 자동으로 업데이트.



View

사용자가 보고  있는 내용을 담당

결정을 담당하는 로직은 View-Model

현재 App. 상태의 데이터 양과 존재 유무를 기반으로 한 Contents를 Rendering



Data-Binding

속성값을 사용하여 View에 데이터를 View

Method를 호출해서 데이터 조작

Method는 Store가 가진 데이터에 따라 움직이는 Binder



View-Model

Store라는 객체에 App 데이터의 모습을 유지

Controller 와 비슷하게 Model에 비동기 방식으로 데이터를 전달



Model => CSS+HTML

App. 데이터의 영속적인 저장소





2. 반응형 애플리케이션
    1. App의 상태변화를 관찰
    2. App. 전체에 변경 알림을 전달
    3. 상태변화에 따라 View를 자동으로 Rendering
    4. 사용자 상호작용을 위해 시기 적절한 피드백을 전달
3. Vue 생명주기
    1. Instance 생성
        1. View-Model에서 데이터 관찰자를생성하고 내부 이벤트 시스템에서 사용될 이벤트를 생성하여 초기화
    2. Template 와 Virtual DOM 생성
        1. Template 혹은 랜터링 함수를 찾아 Tempalte를 Compile
        2. Virtual DOM 복사본을 만들고 그 결과를 HTML DOM에 Mount
    3. Event Loop
        1. 이벤트 루프 중에 관찰자는 View-Model 데이터를 감시
        2. 변화가 있다면 가상 DOM은 다시 Rendering 되여 HTML DOM에 적용
    4. Instance 소멸
        1. 모든 관찰자, Event Listener, 자식 Component들이 삭제
4. Computed Property
    1. data 객체의 속성을 데이터베이스에 저장되는 대표 데이터
    2. Computed Property은 View에서 동적으로 생성되는 데이터
5. v-show & v-if/v-else
    1. v-show
        1. 단일 Contents를 보여주거나 안보여주고자 할때
        2. CSS에서 COM객체를 hide/show
    2. v-if/v-else
        1. 2개의 Contents 중에서 하나를 선택하여 보여주고자 할때
        2. DOM객체에서 Content를 제거
6. v-model : 양방향 데이터 바인딩 
    1. V-model 지시자는 Form 혹은 Text 영역 입력과 Template 에 양방향 데이터 바인딩을 생성
    2. 주로 입력과 form 바인딩
    3. v-bind :  HTML 속성 바인딩
    4. <input v-model:"something">
        1. <input v-bind:"somthing" v-on:input="somthing=$event.target"> 와 동일
7. v-once : 단방향 데이터 바인딩 : 하나의 요소나 컴포넌트에 딱 한번 렌더링
8. 