class libro:
    def __init__(self, titulo, autor,año):
        self.titulo = titulo
        self.autor = autor
        self.año = año

    def mostrar_info(self):
        print(f"Este es el titulo:{self.titulo}, Autor: {self.autor} y año:{self.año}.")