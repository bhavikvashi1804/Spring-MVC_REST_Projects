
Hit Add ToDo Button to start

<hr>
<a href="/to-do1/add" >Add ToDo</a>
<#if todos?has_content>
    <ul>
        <#list todos as todoItem>
            <li>
                ${todoItem.title} - ${todoItem.description}
            </li>
        </#list>
    </ul>
<#else>
    <div>No ToDo Found</div>
</#if>