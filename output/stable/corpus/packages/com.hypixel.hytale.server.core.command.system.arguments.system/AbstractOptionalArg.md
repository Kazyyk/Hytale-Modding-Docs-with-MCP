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

Known subclasses: DefaultArg, FlagArg, OptionalArg

Also in this package: ArgWrapper, Argument, DefaultArg, DefaultValueArgument, FlagArg, OptionalArg, RequiredArg, WrappedArg

Complete API:
  public final Arg addAliases(String newAliases)
  public Arg requiredIf(AbstractOptionalArg<?,?> dependent, AbstractOptionalArg<?,?> otherDependents)
  public Arg requiredIf(AbstractOptionalArg<?,?> dependent)
  public Arg requiredIfAbsent(AbstractOptionalArg<?,?> dependent, AbstractOptionalArg<?,?> otherDependents)
  public Arg requiredIfAbsent(AbstractOptionalArg<?,?> dependent)
  public Arg availableOnlyIfAll(AbstractOptionalArg<?,?> dependent, AbstractOptionalArg<?,?> otherDependents)
  public Arg availableOnlyIfAll(AbstractOptionalArg<?,?> dependent)
  public Arg availableOnlyIfAllAbsent(AbstractOptionalArg<?,?> dependent, AbstractOptionalArg<?,?> otherDependents)
  public Arg availableOnlyIfAllAbsent(AbstractOptionalArg<?,?> dependent)
  private boolean addDependencyArg(Set<AbstractOptionalArg<?,?>> set, Set<AbstractOptionalArg<?,?>> oppositeSet, AbstractOptionalArg<?,?> dependent, AbstractOptionalArg<?,?> otherDependents)
  public boolean verifyArgumentDependencies(CommandContext context, ParseResult parseResult)
  public Arg setPermission(String permission)
  public Set<String> getAliases()
  public String getPermission()
  public boolean hasPermission(CommandSender sender)

Fields:
private final Set<String> aliases
private String permission
private Set<AbstractOptionalArg<?,?>> requiredIf
private Set<AbstractOptionalArg<?,?>> requiredIfAbsent
private Set<AbstractOptionalArg<?,?>> availableOnlyIfAll
private Set<AbstractOptionalArg<?,?>> availableOnlyIfAllAbsent
