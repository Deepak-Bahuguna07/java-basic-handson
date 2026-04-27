class Money {
  final int value;

  Money(int value){
    this.value = value;
  }

  Money add(Money money){
    return new Money(this.value + money.value);
  }

  Money minus(Money money){
    return new Money(this.value - money.value);
  }
}