##donde vas a manejar la logica de conexiones
import psycopg2 ## libreria de python a postgress

def get_connection():
    try:
        conn = psycopg2.connect(
            dbname="postgres",         # Asegúrate de que exista
            user="postgres",         # o el usuario que estés usando
            password="Bimbo321",  # cambia esto
            host="localhost",
            port="5432"
        )
        return conn
    except Exception as e:
        print(f"❌ Error al conectar a la base de datos: {e}")
        return None
