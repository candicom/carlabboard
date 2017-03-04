
-- BOARDDETAIL
INSERT INTO "BOARDDETAIL"("ID", "CONTENT") VALUES (1, 'Barbecue의 약어이다. 예전에는 BBCue라고 썼으나, Cue의 발음이 Q와 비슷하여, 헛갈리기 쉬운 뒤의 Cue가 빠지고 대신 Q가 붙게 되었다. Barbeque로 쓰는 경우도 있지만 철자가 틀린 것이다. 단, 일부 사전에서는 미국식 표현으로 인정하기도 한다.');
INSERT INTO "BOARDDETAIL"("ID", "CONTENT") VALUES (2, '대한민국의 치킨 브랜드. DHC와 헷갈리면 곤란하다. 1997년 별하나치킨이라는 이름으로 창립했으며 그 유명한 콜팝[1]을 필두로 야채치킨[2] 등의 특이한 제품으로 마이너적인 인기를 누리다가 2000년에 이니셜을 따서 BHC라는 이름을 앞세우게 되었다.');
INSERT INTO "BOARDDETAIL"("ID", "CONTENT") VALUES (3, '대한민국의 대표적인 치킨 브랜드 중 하나. 현재 널리 퍼진 치킨깔끔포장의 선두주자로 보인다. 피자상자처럼 각잡힌 네모난 상자에 콜라, 치킨, 치킨무 등을 담아 배달한다.');
INSERT INTO "BOARDDETAIL"("ID", "CONTENT") VALUES (4, '한국의 치킨 프랜차이즈중에서 초창기에 나온 어르신 가운데 하나로, 1982년에 대전광역시에서 문을 열었다. 표기가 "펠리"가 아닌 "페리"카나인 것만 보아도 일본식 영어발음의 잔재가 많이 남아있던 90년대 이전의 업체라는 걸 알 수 있다(블루마블을 부루마블이라 하던 시절이었으니).');
INSERT INTO "BOARDDETAIL"("ID", "CONTENT") VALUES (5, '대한민국 치킨 창렬 원탑 다른 치킨 브랜드와 달리 간장 치킨이 간판 메뉴이자, 이 브랜드를 전국적으로 성공시킨 효자 메뉴이다. 1978년 창업한 대구통닭이 간장치킨의 원조이고, 거기서 일하던 직원이 나와 차린 것이 교촌치킨이라는 설이 지역에서는 많이 알려져 있다.');
INSERT INTO "BOARDDETAIL"("ID", "CONTENT") VALUES (6, '설립년도를 보고 순간 멈칫했겠지만 사실은 페리카나, 스모프 양념통닭, 사또치킨, 맥시칸치킨, 이서방 양념통닭과 더불어 한 세대를 풍미한 처갓집 양념통닭의 후신이 맞다.');
INSERT INTO "BOARDDETAIL"("ID", "CONTENT") VALUES (7, '패스트푸드형 치킨 전문점. 해외 치킨 브랜드인 파파이스를 운영하고 있는 (주)TS푸드앤시스템에서 토종 패스트푸드점을 만들자는 취지로 탄생했다. 법인 이름은 ''해마로푸드서비스 주식회사''.');
INSERT INTO "BOARDDETAIL"("ID", "CONTENT") VALUES (8, '대한민국의 치킨 브랜드. 2005년 3월 경기도 김포시에 1호점(김포북변점)을 개점하고 7월에 2호점(김포사우점)을 개점하면서 프랜차이즈를 시작했다.');
INSERT INTO "BOARDDETAIL"("ID", "CONTENT") VALUES (9, '서울특별시 강남구 논현동(강남구청역 근처)[1]에 본사를 둔 유명 치킨 브랜드. 대구광역시에서 시작하여 대구광역시, 경상북도 지역에 많은 점포를 가지고 있으며 수도권이나 타 권역에도 계속적으로 점포 확장이 이루어지고 있는 상태다. ');
INSERT INTO "BOARDDETAIL"("ID", "CONTENT") VALUES (10, '치킨 프랜차이즈 전문점. 1989년에 시작했으니 원조급으로 역사가 긴 치킨 브랜드에 속한다. 역사가 오래된 브랜드이니 만큼 튀김 옷이 얇고 양념이 약한 한국 스타일의 ''통닭''에 강세를 보이는 브랜드이다.');



-- BOARD
INSERT INTO "BOARD"("ID", "TITLE", "BOARDDETAIL_ID") VALUES (1, 'BBQ', 1);
INSERT INTO "BOARD"("ID", "TITLE", "BOARDDETAIL_ID") VALUES (2, 'BHC', 2);
INSERT INTO "BOARD"("ID", "TITLE", "BOARDDETAIL_ID") VALUES (3, '네네치킨', 3);
INSERT INTO "BOARD"("ID", "TITLE", "BOARDDETAIL_ID") VALUES (4, '페리카나', 4);
INSERT INTO "BOARD"("ID", "TITLE", "BOARDDETAIL_ID") VALUES (5, '교촌치킨', 5);
INSERT INTO "BOARD"("ID", "TITLE", "BOARDDETAIL_ID") VALUES (6, '처갓집 양념치킨', 6);
INSERT INTO "BOARD"("ID", "TITLE", "BOARDDETAIL_ID") VALUES (7, '맘스터치', 7);
INSERT INTO "BOARD"("ID", "TITLE", "BOARDDETAIL_ID") VALUES (8, '굽네치킨', 8);
INSERT INTO "BOARD"("ID", "TITLE", "BOARDDETAIL_ID") VALUES (9, '호식이 두마리치킨', 9);
INSERT INTO "BOARD"("ID", "TITLE", "BOARDDETAIL_ID") VALUES (10, '멕시카나', 10);

