-- 코드를 작성해주세요
SELECT SUM(G.SCORE) AS SCORE, G.EMP_NO, E.EMP_NAME, E.POSITION, E.EMAIL
                                    FROM HR_GRADE AS G
                                    JOIN HR_EMPLOYEES AS E ON G.EMP_NO = E.EMP_NO
                                    WHERE G.YEAR = 2022
                                    GROUP BY G.EMP_NO, G.YEAR
                                    ORDER BY SCORE DESC
                                    LIMIT 1;