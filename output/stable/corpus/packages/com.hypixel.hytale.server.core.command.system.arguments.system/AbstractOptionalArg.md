# AbstractOptionalArg

Type: interface | Package: com.hypixel.hytale.server.core.command.system.arguments.system | Extends: Argument<Arg, DataType>, DataType> extends Argument<Arg, DataType>

public abstract class AbstractOptionalArg<Arg extends Argument<Arg, DataType>, DataType> extends Argument<Arg, DataType>

## Fields

- private final Set<String> aliases
- private String permission

## Methods

- public final Arg addAliases(@Nonnull String... newAliases)
- public Arg requiredIf(@Nonnull AbstractOptionalArg<?, ?> dependent, @Nullable AbstractOptionalArg<?, ?>... otherDependents)
- public Arg requiredIf(@Nonnull AbstractOptionalArg<?, ?> dependent)
- public Arg requiredIfAbsent(@Nonnull AbstractOptionalArg<?, ?> dependent, @Nullable AbstractOptionalArg<?, ?>... otherDependents)
- public Arg requiredIfAbsent(@Nonnull AbstractOptionalArg<?, ?> dependent)
- public Arg availableOnlyIfAll(@Nonnull AbstractOptionalArg<?, ?> dependent, @Nullable AbstractOptionalArg<?, ?>... otherDependents)
- public Arg availableOnlyIfAll(@Nonnull AbstractOptionalArg<?, ?> dependent)
- public Arg availableOnlyIfAllAbsent(@Nonnull AbstractOptionalArg<?, ?> dependent, @Nullable AbstractOptionalArg<?, ?>... otherDependents)
- public Arg availableOnlyIfAllAbsent(@Nonnull AbstractOptionalArg<?, ?> dependent)
- private boolean addDependencyArg( @Nonnull Set<AbstractOptionalArg<?, ?>> set, @Nullable Set<AbstractOptionalArg<?, ?>> oppositeSet, AbstractOptionalArg<?, ?> dependent, @Nullable AbstractOptionalArg<?, ?>... otherDependents )
- public boolean verifyArgumentDependencies(@Nonnull CommandContext context, @Nonnull ParseResult parseResult)
- @Nonnull public Arg setPermission(@Nonnull String permission)
- @Nonnull public Set<String> getAliases()
- @Nullable public String getPermission()
- public boolean hasPermission(@Nonnull CommandSender sender)

## Inner Types

- `AbstractOptionalArg.DefaultValueArgument`
