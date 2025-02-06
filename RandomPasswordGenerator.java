import random
import string

def generate_password(length):
    characters = string.ascii_letters + string.digits + string.punctuation
    return ''.join(random.choice(characters) for _ in range(length))

length = int(input("Enter the password length: "))
print(f"Generated password: {generate_password(length)}")
