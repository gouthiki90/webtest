INSERT INTO BoardTbl(title, content) VALUES("고양이가 너무 좋아요.", "그 중에 삼색 고양이가 최고예요.");

INSERT INTO BoardTbl(title, content) VALUES("고양이의 특성에 대해서", "고양이는 은혜를 갚을 줄 아는 동물입니다.");

INSERT INTO BoardTbl(title, content) VALUES("검은 동물에 대해", "검은 동물은 불행이 아닌 행복을 가져옵니다.");

DELETE FROM BoardTbl WHERE id = 6;

SELECT * FROM BoardTbl;

SELECT * FROM BoardTbl WHERE title LIKE '%고양이%';

UPDATE BoardTbl
SET createDate = '2022.03.23'
WHERE id = 3;