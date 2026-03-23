---
title: "RecipeCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.crafting.commands"
fqcn: "com.hypixel.hytale.builtin.crafting.commands.RecipeCommand"
api_surface: false
extends: "AbstractCommandCollection"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "command"
  - "crafting"
  - "recipe"
---

**Package:** `com.hypixel.hytale.builtin.crafting.commands`

```java
public class RecipeCommand extends AbstractCommandCollection
```

Command collection registered under the name `recipe` for managing player crafting recipes. Provides three subcommands: `learn`, `forget`, and `list`. Each subcommand operates on the executing player by default and has a variant that accepts a target player argument.

## Subcommands

| Name | Description |
|---|---|
| `learn` | Teaches the executing player or a target player a recipe identified by item asset. |
| `forget` | Removes a known recipe from the executing player or a target player. |
| `list` | Displays all known recipes for the executing player or a target player. |

## Constructor

```java
public RecipeCommand()
```

Registers under the name `"recipe"` with description key `"server.commands.recipe.desc"` and adds the `Learn`, `Forget`, and `List` subcommands.

## Inner Classes

| Modifier | Name | Extends | Description |
|---|---|---|---|
| `static` | `Learn` | `AbstractPlayerCommand` | Teaches a recipe via `CraftingPlugin.learnRecipe`. Has a `LearnOther` variant targeting another player. |
| `static` | `Forget` | `AbstractPlayerCommand` | Forgets a recipe via `CraftingPlugin.forgetRecipe`. Has a `ForgetOther` variant targeting another player. |
| `static` | `List` | `AbstractPlayerCommand` | Lists known recipes from `PlayerConfigData.getKnownRecipes()`. Has a `ListOther` variant targeting another player. |

## Related Types

- `CraftingPlugin` -- provides `learnRecipe` and `forgetRecipe` static methods
- `AbstractCommandCollection` -- base class
