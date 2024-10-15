import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class L2022211891_8_Test {

    // 测试用例设计总体原则：
    // - 等价类划分：考虑不同大小的网格、不同数量的岛屿、边界情况等。
    // - 边界值分析：检查最小和最大尺寸的网格、只有一个岛屿且在边界位置等情况。

    private Solution8 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution8();
    }

    @Test
    void testWithExample1() {
        // 测试目的：验证示例 1 的输入是否能正确计算岛屿数量。
        // 测试用例：
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int expected = 1;
        assertEquals(expected, solution.numIslands(grid));
    }

    @Test
    void testWithExample2() {
        // 测试目的：验证示例 2 的输入是否能正确计算岛屿数量。
        // 测试用例：
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        int expected = 3;
        assertEquals(expected, solution.numIslands(grid));
    }

    @Test
    void testSingleIslandAtCorner() {
        // 测试目的：验证只有一个岛屿且在角落位置的情况。
        // 测试用例：
        char[][] grid = {
                {'0', '0', '0'},
                {'0', '1', '0'},
                {'0', '0', '0'}
        };
        int expected = 1;
        assertEquals(expected, solution.numIslands(grid));
    }

    @Test
    void testNoIslands() {
        // 测试目的：验证全是水的网格是否返回正确的岛屿数量。
        // 测试用例：
        char[][] grid = {
                {'0', '0', '0'},
                {'0', '0', '0'},
                {'0', '0', '0'}
        };
        int expected = 0;
        assertEquals(expected, solution.numIslands(grid));
    }

    @Test
    void testLargeGridWithMultipleIslands() {
        // 测试目的：验证较大尺寸的网格且有多个岛屿的情况。
        // 测试用例：
        char[][] grid = {
                {'1', '1', '0', '0', '0', '1', '1'},
                {'1', '1', '0', '0', '0', '1', '1'},
                {'0', '0', '1', '1', '1', '0', '0'},
                {'0', '0', '1', '1', '1', '0', '0'}
        };
        int expected = 3;
        assertEquals(expected, solution.numIslands(grid));
    }
}