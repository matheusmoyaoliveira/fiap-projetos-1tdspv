if __name__ == "__main__":

    campeonato = {
        'Corinthians': 23,
        'Botafogo': 21,
        'Palmeiras': 30,
        'Flamengo': 18,
    }

    print(campeonato)

    campeonato['Santos'] = 19

    for time in campeonato.keys():
        print(f'{time} pts: {campeonato[time]}')

    camp2 = {
        'Corinthians': ['Corin', 23],
        'Botafogo': ['Bota', 21],
        'Palmeiras': ['Palm', 30],
        'Flamengo': ['Fla', 18]
    }

    print(camp2)

    camp3 = {}

    for time in campeonato.keys():
        camp3[time] = [time, campeonato[time]]

    print(f'\n{camp3}')