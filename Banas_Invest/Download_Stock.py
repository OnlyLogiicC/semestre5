import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import matplotlib.dates as mdates

import datetime as dt
import time
import yfinance as yf

#https://pypi.org/project/yfinance/#description

def get_info_on_stock(ticker) :
    stock = yf.Ticker(ticker)
    print(stock.institutional_holders)
    print(stock.recommendations)
    print(stock.history(period="max"))


def save_to_csv_from_yahoo(folder, ticker):
    stock = yf.Ticker(ticker)
    try:
        print("Getting Data for ", ticker)
        hist = stock.history(period="max")["Close"]
        time.sleep(2)
        if hist.empty:
            print("echec download")
        the_file = folder + ticker.replace(".","_") + '.csv'
        print(the_file, "Saved")
        hist.to_csv(the_file)
    except Exception as ex:
        print("echec download2")


folder = "C:/Users/Martin/Documents/GitHub/semestre5/Banas_Invest/Stocks/"

save_to_csv_from_yahoo(folder, "TSLA")
#get_info_on_stock("NIO")