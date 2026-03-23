# RecipeCommand

Type: class | Package: com.hypixel.hytale.builtin.crafting.commands | Extends: AbstractCommandCollection

public class RecipeCommand extends AbstractCommandCollection

Command collection registered under the name `recipe` for managing player crafting recipes. Provides three subcommands: `learn`, `forget`, and `list`. Each subcommand operates on the executing player by default and has a variant that accepts a target player argument.

## Subcommands

- learn: Teaches the executing player or a target player a recipe identified by item asset.
- forget: Removes a known recipe from the executing player or a target player.
- list: Displays all known recipes for the executing player or a target player.

## Constructor


public RecipeCommand()

Registers under the name `"recipe"` with description key `"server.commands.recipe.desc"` and adds the `Learn`, `Forget`, and `List` subcommands.

## Inner Classes

- Learn: Teaches a recipe via `CraftingPlugin.learnRecipe`. Has a `LearnOther` variant targeting another player.
- Forget: Forgets a recipe via `CraftingPlugin.forgetRecipe`. Has a `ForgetOther` variant targeting another player.
- List: Lists known recipes from `PlayerConfigData.getKnownRecipes()`. Has a `ListOther` variant targeting another player.

## Related Types

- `CraftingPlugin` -- provides `learnRecipe` and `forgetRecipe` static methods
- `AbstractCommandCollection` -- base class
