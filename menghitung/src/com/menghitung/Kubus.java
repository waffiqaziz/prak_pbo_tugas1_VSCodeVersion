package com.menghitung;

public class Kubus extends BangunRuang {

  public Kubus(int x) {
    super(x);
  }

  @Override
  double luas() {
    return 6 * x * x;
  }

  @Override
  double volume() {
    return x * x * x;
  }
}