import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import matplotlib.dates as mdates

import datetime as dt
import time
import yfinance as yf

import os

FOLDER_PATH = "C:/Users/Martin/Documents/GitHub/semestre5/Banas_Invest/Stocks"

def get_stock_df_from_csv(ticker) :
    try:
        df = pd.read_csv(FOLDER_PATH + ticker + '.csv', index_col=0)
    except FileNotFoundError:
        print("File Doesn't Exist")
    else:
        return df

files = [x for x in os.listdir(FOLDER_PATH) if os.path.isfile(os.path.join(FOLDER_PATH, x))]
tickers = [os.path.splitext(x)[0] for x in files]
tickers.sort()
print(tickers)
len(tickers)

def add_daily_return_to_df(df):
    df['daily_return'] = (df['Close'] / df['Close'].shift(1)) - 1
    #df.to_csv(FOLDER_PATH + ticker + 'csv')
    return df

def add_cum_return_to_df(df):
    df['cum_return'] = (1 + df['daily_return']).cumprod()
    return df

