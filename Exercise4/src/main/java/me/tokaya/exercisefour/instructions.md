# SIMPLE DnD BATTLE (Java Exercise)

Create a simple **turn-based Dungeons & Dragons style battle**.  
The player fights a **Warlock enemy** until one of them reaches **0 HP**.

Both the **player** and the **warlock** start with **100 HP**.  
Each round they attack each other by **rolling dice** and applying **buffs**.

---

## Concepts you will practice

- User input with `Scanner`
- Lists (`ArrayList`)
- Randomization (`Random` / `Collections`)
- Loops
- Conditionals
- Methods
- Basic statistics calculations

---

## Steps

- Create a **player** with **100 HP** and a **warlock enemy** with **100 HP**.

- The **warlock should have a random name each game**, selected from a list such as:
    - Figaro the Mad
    - Zalthor the Eternal
    - Morvath the Whisperer
    - Eldric the Cursed
    - Nyxar the Shadowbinder

- The game should run in **rounds** until either the **player** or the **warlock** reaches **0 HP**.

---

## Combat System

Each round works as follows:

1. **The player attacks first**
2. The player rolls **two 6-sided dice (2d6)**
3. The **sum of the dice** is the **damage dealt to the warlock**

After the player attack:

4. The **warlock performs the same action**
5. The warlock rolls **two 6-sided dice**
6. The **sum of the dice** is the **damage dealt to the player**

---

## Dice Tracking

Every **individual die rolled** should be stored.

- Player dice results → stored in **one list**
- Warlock dice results → stored in **another list**

These lists will later be used to generate **statistics at the end of the game**.

---

## Card Buff System

After each round:

Both the **player** and the **warlock** must choose a **random card** without seeing its effect.

- Cards should be displayed as positions: [1] [2] [3]

- The **player selects a card** by typing `1`, `2`, or `3`
- The **warlock selects a card randomly**

Each card gives **one random buff**:

- `+1` to all dice results
- `Heal 10 HP`
- `Roll one additional die when attacking`

Buffs should:

- **Stack**
- **Remain active until the end of the game**

---

## Round Display

At the beginning of each round the game should display:

- Player HP
- Warlock HP
- Player active buffs
- Warlock active buffs

Then display something like:
"Press ENTER to roll the dice..."


---

## End Condition

The game ends immediately when:

- The **player HP reaches 0**, or
- The **warlock HP reaches 0**

---

## Statistics (End of Game)

When the game ends, display:

- **Average damage per round (player)**
- **Average damage per round (warlock)**
- **Most frequently rolled die result (player)**
- **Most frequently rolled die result (warlock)**

---

## Considerations

- Be careful when **modifying lists while iterating through them**
- Think about **splitting logic into methods** (attack, buffs, statistics, etc.)
- Remember **buffs must affect future rounds**
- Consider how **additional dice** will affect the attack logic