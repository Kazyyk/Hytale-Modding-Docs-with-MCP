# WhitelistAddCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.accesscontrol.commands | Extends: AbstractAsyncCommand

public class WhitelistAddCommand extends AbstractAsyncCommand

## Fields

- @Nonnull private final HytaleWhitelistProvider whitelistProvider
- @Nonnull private final RequiredArg<ProfileServiceClient.PublicGameProfile> playerArg

## Constructors

- public WhitelistAddCommand(@Nonnull HytaleWhitelistProvider whitelistProvider)

## Methods

- @Nonnull @Override protected CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)

Also in this package: BanCommand, UnbanCommand, WhitelistClearCommand, WhitelistCommand, WhitelistDisableCommand, WhitelistEnableCommand, WhitelistListCommand, WhitelistRemoveCommand, WhitelistStatusCommand

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context)

Fields:
private final HytaleWhitelistProvider whitelistProvider
private final RequiredArg<ProfileServiceClient.PublicGameProfile> playerArg
