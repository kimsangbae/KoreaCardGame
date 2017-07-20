

Player가 Game에 입장한다.

Game은 Player가 2명 이상일 때 시작할 수 있다.
Player가 DEPOSIT_START_MONEY를 지불하면 게임에 참여할 수 있다.

Game이 시작되면 CardDeck을 shuffle()한다.
Game은 Player에게 Card를 PLAY_CARD_COUNT개 만큼 분배한다.

Player는 money과 Card를 소유하고 있다.
Card를 소유한 Player에게 Die()와 Bet() 둘 중 하나의 선택권이 있다.

1명을 제외한 모든 Player가 Die()하면 살아 남은 Player가 BettingMoney를 가져간다.
2명 이상이 Call()로 추가 베팅이 끝나면 1등을 findWinner()하고 1등에게 BettingMoney를 준다. 

카드덱
1. 카드를 섞는다 
2. 카드를 돌린다 
3. 카드를 회수한다


게임규칙
1. 플레이어를 모집한다 
2. 공탁금을 내도록 한다 
3. 카드를 썩은 뒤 나눠 준다 
4. 플레이어가 베팅한다.
5. 1등을 가려낸다.
6. 1등에게 돈 준다


플레이어 
1. 공탁금을 낸다 
2. 카드를 받는다 
3. 베팅한다 
4. 돈을 잃거나 얻는다 
5. 카드를 돌려준다


카드 
1. 타입 2종 
2. 1~10 10개씩
3. 총 20개


베팅바구니 
1. 플레이어로 부터 공탁금을 받는다 
2. 플레이어로 부터 베팅머니를 모은다 
3. 1등에게 모든 돈을 준다
4. 베팅 머니를 초기화한다.
