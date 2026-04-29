class Contact:
    def __init__(self, name, phone, email):
        self.name = name
        self.phone = phone
        self.email = email

    def show_info_0(self):
        print("Nombre:", self.name)
        print("Teléfono:", self.phone)
        print("Correo:", self.email)
        print("------------------------")
    
    def __str__(self):
        return f"{self.name} - {self.phone} - {self.email}"

    def show_info(self):
        print(self.__str__())