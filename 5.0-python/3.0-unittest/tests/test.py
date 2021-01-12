import unittest

# La lcase debe heredar de unittest.TestCase
class my_tests(unittest.TestCase):

    num1 = 0
    num2 = 0
    

    # Todo lo que ponga en setUp se va a ejecutar primero
    def setUp(self):
        self.num1 = 2
        self.num2 = 3

    def test_suma(self):
        self.assertEqual(self.num1 + self.num2,5)

    def test_resta(self):
        self.assertTrue(1-1==0)

    # Estos son los assert mas utilizados
    def test_validate_igualda(self):
        a = 5
        b = 5
        self.assertEqual(a,b)

    def test_validate_no_igualda(self):
        a = 5
        b = 10
        self.assertNotEqual(a,b)

    @unittest.skip('No se ejecuta porque necesita cambios')
    def test_is(self):
        a = 5
        b = 5.0
        self.assertIs(a,b)

    def test_is_not(self):
        a = 5
        b = 10
        self.assertIsNot(a,b)


    def test_validat_verdadero(self):
        a = False
        self.assertTrue(a==False, 'Esperaba un True')


    

    # Esto es para cerrar, borrar todo lo que se inicio en setUp
    def tearDown(self):
        print('Borrando datos iniciado en el setUp')

    # Buscar difernecia entre tearDonw y esto.
    @classmethod
    def tearDownClass(cls):
        print('Borrando datos iniciado en el setUp')
        print('Eliminando bases de datos')





if __name__ == "__main__":
    unittest.main()
