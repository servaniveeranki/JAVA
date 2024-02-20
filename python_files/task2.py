def calculate_bmi(weight, height):
    try:
        weight = float(weight)
        height = float(height)
    except ValueError:
        print("Please enter valid numeric values for weight and height.")
        return None

    if weight <= 0 or height <= 0:
        print("Weight and height must be positive values.")
        return None

    bmi = weight / (height ** 2)

    return bmi


def classify_bmi(bmi):
    if bmi is None:
        return "Invalid input"

    if bmi < 18.5:
        return "Underweight"
    elif 18.5 <= bmi < 25:
        return "Normal weight"
    elif 25 <= bmi < 30:
        return "Overweight"
    else:
        return "Obese"


def main():
    print("****BMI Calculator****")

    weight = input("Enter your weight in kilograms: ")
    height = input("Enter your height in meters: ")
    
    """ hint = feet_to_meters = feet * 0.3048
    inches_to_meters = inches * 0.0254
    total_meters = feet_to_meters + inches_to_meters"""

    bmi = calculate_bmi(weight, height)

    if bmi is not None:
        print(f"\nYour BMI is: {bmi:.2f}")
        category = classify_bmi(bmi)
        print(f"You are classified as: {category}")


if __name__ == "__main__":
    main()
