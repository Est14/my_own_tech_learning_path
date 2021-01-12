import unittest
import calc


class TestCalc(unittest.TestCase):

    def test_add(self):
        result = calc.add(5, 5)
        self.assertEqual(result, 15)

# Without this the test does not run
if __name__ == "__main__":
    unittest.main()
