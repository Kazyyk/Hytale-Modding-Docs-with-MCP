---
title: "NameMatching"
kind: "enum"
package: "com.hypixel.hytale.server.core"
fqcn: "com.hypixel.hytale.server.core.NameMatching"
api_surface: true
extends: ~
implements: []
generator_version: "1.0.0"
generated_at: "2026-03-20T20:00:00Z"
tags:
  - "utility"
  - "matching"
  - "commands"
  - "player-lookup"
---

**Package:** `com.hypixel.hytale.server.core`

```java
public enum NameMatching
```

Provides strategies for matching player names (or other named entities) from a collection. Each constant defines a comparator and an equality predicate that together determine how names are scored and matched. Used by the command system and other subsystems that resolve player names from partial input.

## Constants

| Constant | Match Behavior | Case Sensitive |
|---|---|---|
| `EXACT` | Requires an exact string match. Returns the match or `null`. | Yes |
| `EXACT_IGNORE_CASE` | Requires an exact match, ignoring case. | No |
| `STARTS_WITH` | Matches if the candidate starts with the input. Prefers the shortest matching name (closest match). | Yes |
| `STARTS_WITH_IGNORE_CASE` | Matches if the candidate starts with the input, ignoring case. Prefers the shortest matching name. | No |

## Fields

| Field | Type | Modifiers | Description |
|---|---|---|---|
| `DEFAULT` | `NameMatching` | `public static` | The default matching strategy. Set to `STARTS_WITH_IGNORE_CASE`. |

## Methods

```java
public Comparator<String> getComparator()
```

Returns the `Comparator<String>` used by this matching strategy. The comparator returns `Integer.MIN_VALUE` for non-matches and a distance score for matches (lower is better for prefix-based strategies).

```java
@Nullable
public <T> T find(@Nonnull Collection<T> players, String value, @Nonnull Function<T, String> getter)
```

Searches the given collection for the best match using this strategy's comparator and equality predicate. The `getter` function extracts the name string from each element. Returns the best match, or `null` if no match is found. An exact equality match (per the strategy's predicate) is always returned immediately without scoring.

```java
@Nullable
public static <T> T find(
    @Nonnull Collection<T> players,
    String value,
    @Nonnull Function<T, String> getter,
    @Nonnull Comparator<String> comparator,
    @Nonnull BiPredicate<String, String> equality
)
```

Static overload that accepts a custom comparator and equality predicate. Searches the collection for the best match by scoring each candidate with the comparator. An exact equality match is returned immediately. If no exact match exists, the candidate with the highest score (above `Integer.MIN_VALUE`) is returned. Returns `null` if nothing matches.

## Example

```java
// Find a player by partial name (case-insensitive prefix match)
Player target = NameMatching.DEFAULT.find(
    server.getOnlinePlayers(),
    "ale",
    Player::getName
);

// Exact match only
Player exact = NameMatching.EXACT.find(
    server.getOnlinePlayers(),
    "Alex",
    Player::getName
);
```

## Related Types

- [Player](Player.md) -- the most common target for name matching
- [CommandContext](CommandContext.md) -- command argument parsing often uses name matching to resolve player targets
