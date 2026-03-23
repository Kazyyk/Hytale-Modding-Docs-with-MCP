# ArgWrapper

Type: record | Package: com.hypixel.hytale.server.core.command.system.arguments.system | Extends: WrappedArg<BasicType>, BasicType>( @Nonnull ArgumentType<BasicType> argumentType, @Nonnull Function<Argument<?, BasicType>, W> wrappedArgProviderFunction )

public record ArgWrapper<W extends WrappedArg<BasicType>, BasicType>( @Nonnull ArgumentType<BasicType> argumentType, @Nonnull Function<Argument<?, BasicType>, W> wrappedArgProviderFunction )

## Methods

- public W wrapArg(@Nonnull Argument<?, BasicType> argument)
