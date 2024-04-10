<h2>Edibles</h2>
<p><a href="https://github.com/Serilum/Edibles"><img src="https://serilum.com/assets/data/logo/edibles.png"></a></p><h2>Download</h2>
<p>You can download Edibles on CurseForge and Modrinth:</p><p>&nbsp;&nbsp;CurseForge: &nbsp;&nbsp;<a href="https://curseforge.com/minecraft/mc-mods/edibles">https://curseforge.com/minecraft/mc-mods/edibles</a><br>&nbsp;&nbsp;Modrinth: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://modrinth.com/mod/edibles">https://modrinth.com/mod/edibles</a></p>
<h2>Issue Tracker</h2>
<p>To keep a better overview of all mods, the issue tracker is located in a separate repository.<br>&nbsp;&nbsp;For issues, ideas, suggestions or anything else, please follow this link:</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;-> <a href="https://serilum.com/url/issue-tracker">Issue Tracker</a></p>
<h2>Pull Requests</h2>
<p>Because of the way mod loader files are bundled into one jar, some extra information is needed to do a PR.<br>&nbsp;&nbsp;A wiki page entry about it is available here:</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;-> <a href="https://serilum.com/url/pull-requests">Pull Request Information</a></p>
<h2>Mod Description</h2>
<p style="text-align:center"><a href="https://serilum.com/" rel="nofollow"><img src="https://github.com/Serilum/.cdn/raw/main/description/header/header.png" alt="" width="838" height="400"></a></p>
<p style="text-align:center"><a href="https://curseforge.com/members/serilum/projects" rel="nofollow"><img src="https://raw.githubusercontent.com/Serilum/.data-workflow/main/badges/svg/curseforge.svg" width="200"></a> <a href="https://modrinth.com/user/Serilum" rel="nofollow"><img src="https://raw.githubusercontent.com/Serilum/.data-workflow/main/badges/svg/modrinth.svg" width="200"></a> <a href="https://patreon.com/serilum" rel="nofollow"><img src="https://raw.githubusercontent.com/Serilum/.data-workflow/main/badges/svg/patreon.svg" width="200"></a> <a href="https://youtube.com/@serilum" rel="nofollow"><img src="https://raw.githubusercontent.com/Serilum/.data-workflow/main/badges/svg/youtube.svg" width="200"></a></p>
<p><strong><span style="font-size:24px">Requires the library mod&nbsp;<a style="font-size:24px" href="https://curseforge.com/minecraft/mc-mods/collective" rel="nofollow">Collective</a>.</span></strong><strong>&nbsp;<br><br> &nbsp; &nbsp;This mod is part of <span style="color:#008000"><a style="color:#008000" href="https://curseforge.com/minecraft/modpacks/the-vanilla-experience" rel="nofollow">The Vanilla Experience</a></span>.</strong><br><span style="font-size:18px">Edibles is a minimalistic configurable mod which makes lots of ingredients edible, after which the player receives a short status effect. It supersedes some previous edible ingredient mods I've made, and bundles them together with more effects planned in the future. By default there is a global cooldown of 1 second in between eating the edibles.</span><br><br><br><span style="font-size:18px"><strong>Currently works with blaze powder, glowstone dust, magma cream, sugar, ghast tears, phantom membrane and rabbit's feet.</strong></span><br><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/edibles/a.png" width="160" height="160"></picture><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/edibles/b.png" width="160" height="160"></picture><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/edibles/c.png" width="160" height="160"></picture><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/edibles/d.png" width="160" height="160"></picture><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/edibles/e.png" width="160" height="160"></picture><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/edibles/f.png" width="160" height="160"></picture><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/edibles/g.png" width="160" height="160"></picture><br><em><br>Blaze powder -&gt; strength effect</em><br><em>Glowstone dust -&gt; gives entities around the glow effect</em><br><em>Magma cream -&gt; fire resistance</em><br><em>Sugar -&gt; speed effect<br>Ghast tear -&gt; regeneration<br>Phantom membrane -&gt; slow falling<br>Rabbit's foot -&gt; Jump boost</em></p>
<p>&nbsp;</p>
<p><span style="font-size:18px"><strong>By default the glow effect is 20 seconds and the others are 15 seconds. You can change this in the configuration file.</strong></span><br><br><br><strong><span style="font-size:20px">Configurable:</span> <span style="color:#008000;font-size:14px"><a style="color:#008000" href="https://github.com/Serilum/.information/wiki/how-to-configure-mods" rel="nofollow">(&nbsp;how do I configure?&nbsp;)</a></span><br></strong><strong><span style="font-size:14px"># Weakness effect</span><br>maxItemUsesPerDaySingleItem</strong>&nbsp;(default = 16, min -1, max 1280): <span style="font-size:10px">The maximum amount of an item a player can eat before receiving the weakness effect. A value of -1 disables this feature.</span><strong><br>maxItemUsesPerDayTotal </strong>(default = -1, min -1, max 1280): <span style="font-size:10px">The maximum of the total amount of items a player can eat before receiving the weakness effect. A value of -1 disables this feature.</span><strong><br>weaknessDurationSeconds </strong>(default = 45, min 1, max 3600): <span style="font-size:10px">The duration of the weakness effect in seconds when eating too much of an item.</span><br><br><strong><span style="font-size:14px"># Glow effect</span><br>glowEntityDurationSeconds</strong>&nbsp;(default = 20, min 0, max 3600): <span style="font-size:10px">When eating glowstone, the duration in seconds of how long entities around should be glowing with an outline. A value of 0 disables the item use.</span><strong><br>glowEntitiesAroundAffectedRadiusBlocks </strong>(default = 32, min 1, max 128): <span style="font-size:10px">For the glow effect, the radius in blocks around the player of entities affected.</span><br><br><strong><span style="font-size:14px"># Other</span><br></strong><strong>_cooldownInMsBetweenUses</strong>&nbsp;(default = 1000, min 0, max 3600000): <span style="font-size:10px">The time in miliseconds of cooldown in between uses of eating an edible.</span><strong><br>blazePowderStrengthDurationSeconds</strong>&nbsp;(default = 15, min 0, max 3600): <span style="font-size:10px">After eating blaze powder, the duration in seconds of the strength effect the player receives. A value of 0 disables the item use.</span><strong><br>magmaCreamFireResistanceDurationSeconds </strong>(default = 15, min 0, max 3600): <span style="font-size:10px">After eating magma cream, the duration in seconds of the fire resistance effect the player receives. A value of 0 disables the item use.</span><strong><br>sugarSpeedDurationSeconds </strong>(default = 15, min 0, max 3600): <span style="font-size:10px">After eating some sugar, the duration in seconds of the speed effect the player receives. A value of 0 disables the item use.</span><br><strong>ghastTearDurationSeconds </strong>(default = 15, min 0, max 3600): <span style="font-size:10px">After eating a ghast tear, the duration in seconds of the regenration effect the player receives. A value of 0 disables the item use.</span><br><strong>phantomMembraneDurationSeconds </strong>(default = 15, min 0, max 3600): <span style="font-size:10px">After eating some phantom membrane, the duration in seconds of the slow falling effect the player receives. A value of 0 disables the item use.</span><br><strong>rabbitsFootDurationSeconds </strong>(default = 15, min 0, max 3600): <span style="font-size:10px">After eating a rabbit's foot, the duration in seconds of the jump boost effect the player receives. A value of 0 disables the item use.</span><br><br><br><span style="font-size:24px;color:#f90"><strong>Some GIFs!</strong></span><br><strong>Some of the effects of eating ingredients in action:</strong></p>
<div class="spoiler">
<p><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/edibles/h.gif" alt="gif0" width="1000" height="508"></picture></p>
</div>
<p>&nbsp;<br><br><strong>Eating too many ingredients in the same day will result in the player receiving the weakness effect.</strong></p>
<div class="spoiler">
<p><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/edibles/i.gif" alt="gif1" width="1000" height="506"></picture></p>
</div>
<p>&nbsp;<br><br><strong>The effect of eating glowstone, entities around the player will receive the glow effect and be visible through walls:</strong></p>
<div class="spoiler">
<p><picture><img src="https://github.com/Serilum/.cdn/raw/main/projects/edibles/j.gif" alt="gif2" width="1000" height="572"></picture></p>
</div>
<p><br>------------------<br><br><span style="font-size:24px"><strong>You may freely use this mod in any modpack, as long as the download remains hosted within the CurseForge or Modrinth ecosystem.</strong></span><br><br><span style="font-size:18px"><a style="font-size:18px;color:#008000" href="https://serilum.com/" rel="nofollow">Serilum.com</a> contains an overview and more information on all mods available.</span><br><br><span style="font-size:14px">Comments are disabled as I'm unable to keep track of all the separate pages on each mod.</span><span style="font-size:14px"><br>For issues, ideas, suggestions or anything else there is the&nbsp;<a style="font-size:14px;color:#008000" href="https://github.com/Serilum/.issue-tracker" rel="nofollow">Github repo</a>. Thanks!</span><span style="font-size:6px"><br><br></span></p>
<p style="text-align:center"><a href="https://serilum.com/donate" rel="nofollow"><img src="https://github.com/Serilum/.cdn/raw/main/description/projects/support.svg" alt="" width="306" height="50"></a></p>