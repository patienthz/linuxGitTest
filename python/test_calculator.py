from calculator import square


def main():
    test_assert()


from calculator import square


def test_assert():
    assert square(2) == 4
    assert square(3) == 9
    assert square(-2) == 4
    assert square(-3) == 9
    assert square(0) == 0

if __name__ == "__main__":
    main()