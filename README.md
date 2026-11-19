# Currency Converter

A console-based Java application for converting Indian Rupees (INR) to and from Kuwaiti Dinars (KWD), US Dollars (USD), and UAE Dirhams (AED).

## Features

- Convert INR to KWD, USD, or AED
- Convert KWD, USD, or AED to INR
- Interactive menu interface
- Results rounded and displayed to two decimal places

## Requirements

- Java Development Kit (JDK) 8 or newer

## Run the Project

From the project directory, compile the Java source:

```bash
javac currencyconverter.java
```

Run the application:

```bash
java currencyconverter
```

## Example

```text
===== CURRENCY CONVERTER =====
1. Convert INR into Foreign Currency
2. Convert Foreign Currency into INR
3. Exit
Enter your choice: 1

1. Convert INR into KWD
2. Convert INR into USD
3. Convert INR into AED
Enter your choice: 2
Enter amount in INR: 100
Converted amount in USD: 1.07
```

## Exchange Rates

The application uses the following fixed conversion rates:

| Currency | INR conversion |
|---|---:|
| 1 INR | 0.003324026 KWD |
| 1 INR | 0.010701139 USD |
| 1 INR | 0.039272362 AED |
| 1 KWD | 300.84 INR |
| 1 USD | 93.448 INR |
| 1 AED | 25.4632 INR |

These rates are hard-coded and do not update automatically. They may not reflect current market exchange rates.
