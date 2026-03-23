# LearnRecipeInteraction

Type: class | Package: com.hypixel.hytale.builtin.crafting.interaction | Extends: SimpleInstantInteraction

public class LearnRecipeInteraction extends SimpleInstantInteraction

Block or entity interaction handler for LearnRecipe behavior.

## Constants

- @Nonnull public static final KeyedCodec<String> ITEM_ID

## Fields

- @Nullable protected String itemId

## Methods

- @Nonnull @Override public WaitForDataFrom getWaitForDataFrom()
- @Override protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
- @Nonnull @Override public String toString()

Also in this package: OpenBenchPageInteraction, OpenProcessingBenchInteraction, PageType

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public String toString()

Fields:
public static final KeyedCodec<String> ITEM_ID
public static final BuilderCodec<LearnRecipeInteraction> CODEC
protected String itemId
