# StdLib

Type: class | Package: com.hypixel.hytale.server.npc.util.expression | Extends: com.hypixel.hytale.server.npc.util.expression.StdScope

public class StdLib extends StdScope

Singleton standard library scope that serves as the root parent for all NPC expression scopes. Registers built-in constants and functions used in NPC role JSON expressions.

## Built-in Constants

- BOOLEAN true
- BOOLEAN false
- NUMBER PI

## Built-in Functions

- max(NUMBER, NUMBER) -> NUMBER
- min(NUMBER, NUMBER) -> NUMBER
- isEmpty(STRING) -> BOOLEAN
- isEmptyStringArray(STRING_ARRAY) -> BOOLEAN
- isEmptyNumberArray(NUMBER_ARRAY) -> BOOLEAN
- random() -> NUMBER
- randomInRange(NUMBER, NUMBER) -> NUMBER
- makeRange(NUMBER) -> NUMBER_ARRAY

## Methods

- public static StdScope getInstance()

## Related Types

- StdScope -- parent class providing the symbol table
- Expression -- uses this as the root scope for NPC expressions
