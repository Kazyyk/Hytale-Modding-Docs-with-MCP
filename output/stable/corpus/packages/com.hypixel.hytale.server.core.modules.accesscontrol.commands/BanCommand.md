# BanCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.accesscontrol.commands | Extends: AbstractAsyncCommand

public class BanCommand extends AbstractAsyncCommand

## Fields

- @Nonnull private final HytaleBanProvider banProvider
- @Nonnull private final RequiredArg<ProfileServiceClient.PublicGameProfile> playerArg

## Constructors

- public BanCommand(@Nonnull HytaleBanProvider banProvider)

## Methods

- @Nonnull @Override protected CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)
