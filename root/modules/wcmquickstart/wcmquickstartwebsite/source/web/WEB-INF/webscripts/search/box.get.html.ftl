<form action="${url.context}/search.html" method="get">
    <fieldset class="search-fieldset">
        <input type="hidden" value="${webSite.rootSection.id}" name="sectionId" />
        <input type="text" class="search-input" value="<#if phrase??>${phrase?html}<#else>${msg('search.box.search')?html}</#if>" name="phrase" id="search-phrase" maxlength="100"/>
        <input type="submit" value="" class="input-arrow" />
    </fieldset>
</form>
